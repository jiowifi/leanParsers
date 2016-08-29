import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String start_time;
	public String organizer_description;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String description;
	public String organizer_name;
	public String background_image;
	public String logo;
	public String topic;
	public String location_name;
	public String type;
	public String name;
	public String schedule_published_on;
	public int id;
	public String email;
	public String timezone;
	public CopyrightModel _copyright;
	public String state;

	public RootModel(String privacy, String code_of_conduct, ArrayList<Social_linksModel> social_links, String end_time, String start_time, String organizer_description, CreatorModel creator, Call_for_papersModel call_for_papers, VersionModel version, String description, String organizer_name, String background_image, String logo, String topic, String location_name, String type, String name, String schedule_published_on, int id, String email, String timezone, CopyrightModel copyright, String state) {

		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.end_time = end_time;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.description = description;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.logo = logo;
		this.topic = topic;
		this.location_name = location_name;
		this.type = type;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.email = email;
		this.timezone = timezone;
		this._copyright = copyright;
		this.state = state;

	}

}