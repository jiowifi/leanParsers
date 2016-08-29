import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public CreatorModel _creator;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String type;
	public String organizer_description;
	public VersionModel _version;
	public String state;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String start_time;
	public String organizer_name;
	public String description;
	public String timezone;
	public int id;
	public String name;
	public String topic;
	public String background_image;
	public String location_name;
	public String email;
	public String code_of_conduct;

	public RootModel(String schedule_published_on, CreatorModel creator, String logo, Call_for_papersModel call_for_papers, CopyrightModel copyright, String type, String organizer_description, VersionModel version, String state, String end_time, ArrayList<Social_linksModel> social_links, String privacy, String start_time, String organizer_name, String description, String timezone, int id, String name, String topic, String background_image, String location_name, String email, String code_of_conduct) {

		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.type = type;
		this.organizer_description = organizer_description;
		this._version = version;
		this.state = state;
		this.end_time = end_time;
		this.social_links = social_links;
		this.privacy = privacy;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.description = description;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
		this.topic = topic;
		this.background_image = background_image;
		this.location_name = location_name;
		this.email = email;
		this.code_of_conduct = code_of_conduct;

	}

}