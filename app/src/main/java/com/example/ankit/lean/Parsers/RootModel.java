import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String type;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String logo;
	public String organizer_description;
	public String description;
	public VersionModel _version;
	public String name;
	public String timezone;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String code_of_conduct;
	public String background_image;
	public String location_name;
	public int id;
	public String end_time;
	public String start_time;
	public String email;
	public String state;

	public RootModel(String organizer_name, ArrayList<Social_linksModel> social_links, String schedule_published_on, String type, CopyrightModel copyright, CreatorModel creator, String logo, String organizer_description, String description, VersionModel version, String name, String timezone, String topic, Call_for_papersModel call_for_papers, String privacy, String code_of_conduct, String background_image, String location_name, int id, String end_time, String start_time, String email, String state) {

		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._copyright = copyright;
		this._creator = creator;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.description = description;
		this._version = version;
		this.name = name;
		this.timezone = timezone;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.location_name = location_name;
		this.id = id;
		this.end_time = end_time;
		this.start_time = start_time;
		this.email = email;
		this.state = state;

	}

}