import java.util.ArrayList;

class RootModel {

	public String description;
	public String organizer_name;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String end_time;
	public String state;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String logo;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String name;
	public String organizer_description;
	public String timezone;
	public String start_time;
	public String background_image;
	public CreatorModel _creator;
	public String email;
	public int id;
	public String type;
	public String topic;

	public RootModel(String description, String organizer_name, String schedule_published_on, CopyrightModel copyright, String end_time, String state, VersionModel version, ArrayList<Social_linksModel> social_links, String code_of_conduct, String logo, String location_name, Call_for_papersModel call_for_papers, String privacy, String name, String organizer_description, String timezone, String start_time, String background_image, CreatorModel creator, String email, int id, String type, String topic) {

		this.description = description;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.end_time = end_time;
		this.state = state;
		this._version = version;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.name = name;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.start_time = start_time;
		this.background_image = background_image;
		this._creator = creator;
		this.email = email;
		this.id = id;
		this.type = type;
		this.topic = topic;

	}

}