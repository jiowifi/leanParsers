import java.util.ArrayList;

class RootModel {

	public String email;
	public String organizer_description;
	public String end_time;
	public String location_name;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String code_of_conduct;
	public String name;
	public VersionModel _version;
	public String timezone;
	public String start_time;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String background_image;
	public String description;
	public CopyrightModel _copyright;
	public String organizer_name;
	public CreatorModel _creator;
	public String logo;
	public String privacy;
	public String state;

	public RootModel(String email, String organizer_description, String end_time, String location_name, String schedule_published_on, Call_for_papersModel call_for_papers, int id, String code_of_conduct, String name, VersionModel version, String timezone, String start_time, String topic, ArrayList<Social_linksModel> social_links, String type, String background_image, String description, CopyrightModel copyright, String organizer_name, CreatorModel creator, String logo, String privacy, String state) {

		this.email = email;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._version = version;
		this.timezone = timezone;
		this.start_time = start_time;
		this.topic = topic;
		this.social_links = social_links;
		this.type = type;
		this.background_image = background_image;
		this.description = description;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.logo = logo;
		this.privacy = privacy;
		this.state = state;

	}

}