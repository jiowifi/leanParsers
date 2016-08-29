import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String description;
	public String background_image;
	public String state;
	public String start_time;
	public String logo;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public VersionModel _version;
	public String privacy;
	public String organizer_description;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String location_name;
	public String schedule_published_on;
	public String timezone;
	public String name;
	public String email;
	public String topic;
	public String code_of_conduct;
	public String type;

	public RootModel(CopyrightModel copyright, String description, String background_image, String state, String start_time, String logo, String end_time, Call_for_papersModel call_for_papers, String organizer_name, VersionModel version, String privacy, String organizer_description, CreatorModel creator, ArrayList<Social_linksModel> social_links, int id, String location_name, String schedule_published_on, String timezone, String name, String email, String topic, String code_of_conduct, String type) {

		this._copyright = copyright;
		this.description = description;
		this.background_image = background_image;
		this.state = state;
		this.start_time = start_time;
		this.logo = logo;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this._version = version;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.social_links = social_links;
		this.id = id;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.name = name;
		this.email = email;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.type = type;

	}

}