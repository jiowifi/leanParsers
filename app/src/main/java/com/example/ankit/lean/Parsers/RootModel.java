import java.util.ArrayList;

class RootModel {

	public String name;
	public String topic;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String background_image;
	public String type;
	public String end_time;
	public String email;
	public String schedule_published_on;
	public String state;
	public VersionModel _version;
	public String description;
	public String logo;
	public int id;
	public String start_time;
	public CopyrightModel _copyright;
	public String privacy;
	public String location_name;
	public String organizer_description;
	public String organizer_name;

	public RootModel(String name, String topic, String timezone, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String code_of_conduct, CreatorModel creator, String background_image, String type, String end_time, String email, String schedule_published_on, String state, VersionModel version, String description, String logo, int id, String start_time, CopyrightModel copyright, String privacy, String location_name, String organizer_description, String organizer_name) {

		this.name = name;
		this.topic = topic;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.background_image = background_image;
		this.type = type;
		this.end_time = end_time;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this._version = version;
		this.description = description;
		this.logo = logo;
		this.id = id;
		this.start_time = start_time;
		this._copyright = copyright;
		this.privacy = privacy;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;

	}

}