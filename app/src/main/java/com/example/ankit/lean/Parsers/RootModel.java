import java.util.ArrayList;

class RootModel {

	public String type;
	public String topic;
	public CopyrightModel _copyright;
	public String timezone;
	public String background_image;
	public String description;
	public int id;
	public CreatorModel _creator;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String code_of_conduct;
	public VersionModel _version;
	public String privacy;
	public String start_time;
	public String name;
	public String email;
	public String location_name;
	public String end_time;
	public String logo;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String state;

	public RootModel(String type, String topic, CopyrightModel copyright, String timezone, String background_image, String description, int id, CreatorModel creator, String organizer_name, ArrayList<Social_linksModel> social_links, String organizer_description, String code_of_conduct, VersionModel version, String privacy, String start_time, String name, String email, String location_name, String end_time, String logo, String schedule_published_on, Call_for_papersModel call_for_papers, String state) {

		this.type = type;
		this.topic = topic;
		this._copyright = copyright;
		this.timezone = timezone;
		this.background_image = background_image;
		this.description = description;
		this.id = id;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.privacy = privacy;
		this.start_time = start_time;
		this.name = name;
		this.email = email;
		this.location_name = location_name;
		this.end_time = end_time;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.state = state;

	}

}