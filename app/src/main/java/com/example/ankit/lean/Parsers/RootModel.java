import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String description;
	public CreatorModel _creator;
	public String type;
	public String end_time;
	public String email;
	public String organizer_description;
	public String topic;
	public VersionModel _version;
	public String privacy;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String start_time;
	public String organizer_name;
	public CopyrightModel _copyright;
	public int id;
	public String name;
	public String background_image;
	public String code_of_conduct;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String logo;

	public RootModel(String timezone, String description, CreatorModel creator, String type, String end_time, String email, String organizer_description, String topic, VersionModel version, String privacy, String location_name, Call_for_papersModel call_for_papers, String schedule_published_on, String start_time, String organizer_name, CopyrightModel copyright, int id, String name, String background_image, String code_of_conduct, String state, ArrayList<Social_linksModel> social_links, String logo) {

		this.timezone = timezone;
		this.description = description;
		this._creator = creator;
		this.type = type;
		this.end_time = end_time;
		this.email = email;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this._version = version;
		this.privacy = privacy;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.id = id;
		this.name = name;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.social_links = social_links;
		this.logo = logo;

	}

}