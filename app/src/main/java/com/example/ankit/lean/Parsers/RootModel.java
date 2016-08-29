import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public CopyrightModel _copyright;
	public String logo;
	public VersionModel _version;
	public String privacy;
	public String end_time;
	public String schedule_published_on;
	public String state;
	public String organizer_description;
	public String timezone;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public CreatorModel _creator;
	public String start_time;
	public String type;
	public String name;
	public String code_of_conduct;
	public String background_image;
	public int id;
	public String location_name;
	public String topic;

	public RootModel(String organizer_name, CopyrightModel copyright, String logo, VersionModel version, String privacy, String end_time, String schedule_published_on, String state, String organizer_description, String timezone, String description, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String email, CreatorModel creator, String start_time, String type, String name, String code_of_conduct, String background_image, int id, String location_name, String topic) {

		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.logo = logo;
		this._version = version;
		this.privacy = privacy;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.email = email;
		this._creator = creator;
		this.start_time = start_time;
		this.type = type;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.id = id;
		this.location_name = location_name;
		this.topic = topic;

	}

}