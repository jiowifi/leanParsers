import java.util.ArrayList;

class RootModel {

	public String location_name;
	public CreatorModel _creator;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String topic;
	public int id;
	public String email;
	public String code_of_conduct;
	public String description;
	public String start_time;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String timezone;
	public String state;
	public String schedule_published_on;
	public String organizer_name;
	public String type;
	public String logo;
	public CopyrightModel _copyright;
	public String end_time;
	public String name;

	public RootModel(String location_name, CreatorModel creator, String organizer_description, Call_for_papersModel call_for_papers, VersionModel version, String topic, int id, String email, String code_of_conduct, String description, String start_time, String background_image, ArrayList<Social_linksModel> social_links, String privacy, String timezone, String state, String schedule_published_on, String organizer_name, String type, String logo, CopyrightModel copyright, String end_time, String name) {

		this.location_name = location_name;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.topic = topic;
		this.id = id;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.start_time = start_time;
		this.background_image = background_image;
		this.social_links = social_links;
		this.privacy = privacy;
		this.timezone = timezone;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.type = type;
		this.logo = logo;
		this._copyright = copyright;
		this.end_time = end_time;
		this.name = name;

	}

}