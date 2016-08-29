import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String location_name;
	public String organizer_description;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String end_time;
	public String privacy;
	public String name;
	public String email;
	public String logo;
	public String start_time;
	public VersionModel _version;
	public String description;
	public CopyrightModel _copyright;
	public String state;
	public String timezone;
	public String topic;
	public String background_image;
	public String type;

	public RootModel(String schedule_published_on, int id, ArrayList<Social_linksModel> social_links, String organizer_name, String location_name, String organizer_description, String code_of_conduct, Call_for_papersModel call_for_papers, CreatorModel creator, String end_time, String privacy, String name, String email, String logo, String start_time, VersionModel version, String description, CopyrightModel copyright, String state, String timezone, String topic, String background_image, String type) {

		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.end_time = end_time;
		this.privacy = privacy;
		this.name = name;
		this.email = email;
		this.logo = logo;
		this.start_time = start_time;
		this._version = version;
		this.description = description;
		this._copyright = copyright;
		this.state = state;
		this.timezone = timezone;
		this.topic = topic;
		this.background_image = background_image;
		this.type = type;

	}

}