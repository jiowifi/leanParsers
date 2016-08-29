import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String schedule_published_on;
	public String organizer_description;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String timezone;
	public String logo;
	public String type;
	public String state;
	public String background_image;
	public String name;
	public String email;
	public String end_time;
	public String topic;
	public String location_name;
	public int id;
	public String start_time;
	public VersionModel _version;

	public RootModel(Call_for_papersModel call_for_papers, String privacy, String code_of_conduct, CopyrightModel copyright, String organizer_name, String schedule_published_on, String organizer_description, CreatorModel creator, ArrayList<Social_linksModel> social_links, String description, String timezone, String logo, String type, String state, String background_image, String name, String email, String end_time, String topic, String location_name, int id, String start_time, VersionModel version) {

		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.social_links = social_links;
		this.description = description;
		this.timezone = timezone;
		this.logo = logo;
		this.type = type;
		this.state = state;
		this.background_image = background_image;
		this.name = name;
		this.email = email;
		this.end_time = end_time;
		this.topic = topic;
		this.location_name = location_name;
		this.id = id;
		this.start_time = start_time;
		this._version = version;

	}

}