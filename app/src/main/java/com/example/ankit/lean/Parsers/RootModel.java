import java.util.ArrayList;

class RootModel {

	public String email;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String timezone;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public int id;
	public String state;
	public String description;
	public String privacy;
	public CreatorModel _creator;
	public String organizer_name;
	public String name;
	public String start_time;
	public String topic;
	public String logo;
	public String schedule_published_on;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String type;
	public String organizer_description;
	public String end_time;

	public RootModel(String email, Call_for_papersModel call_for_papers, String location_name, String timezone, CopyrightModel copyright, String code_of_conduct, int id, String state, String description, String privacy, CreatorModel creator, String organizer_name, String name, String start_time, String topic, String logo, String schedule_published_on, String background_image, ArrayList<Social_linksModel> social_links, VersionModel version, String type, String organizer_description, String end_time) {

		this.email = email;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.timezone = timezone;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.state = state;
		this.description = description;
		this.privacy = privacy;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.name = name;
		this.start_time = start_time;
		this.topic = topic;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.social_links = social_links;
		this._version = version;
		this.type = type;
		this.organizer_description = organizer_description;
		this.end_time = end_time;

	}

}