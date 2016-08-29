import java.util.ArrayList;

class RootModel {

	public String state;
	public String email;
	public String start_time;
	public String type;
	public int id;
	public String name;
	public String code_of_conduct;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String timezone;
	public String schedule_published_on;
	public VersionModel _version;
	public String organizer_description;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String description;
	public String background_image;
	public String privacy;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String topic;

	public RootModel(String state, String email, String start_time, String type, int id, String name, String code_of_conduct, String organizer_name, CopyrightModel copyright, String timezone, String schedule_published_on, VersionModel version, String organizer_description, CreatorModel creator, ArrayList<Social_linksModel> social_links, String end_time, String description, String background_image, String privacy, String location_name, Call_for_papersModel call_for_papers, String logo, String topic) {

		this.state = state;
		this.email = email;
		this.start_time = start_time;
		this.type = type;
		this.id = id;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.social_links = social_links;
		this.end_time = end_time;
		this.description = description;
		this.background_image = background_image;
		this.privacy = privacy;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.topic = topic;

	}

}